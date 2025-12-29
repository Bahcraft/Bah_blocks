import os
import json

# ================= CONFIGURAÇÃO =================
# Coloque aqui o ID do seu mod (EXATAMENTE como está no seu código Java)
MOD_ID = "bahpokemon"

# Lista com os nomes dos seus Pokémons (use apenas letras minúsculas e underscores)
# O script vai adicionar "_block" automaticamente se você quiser, ou pode colocar aqui.
lista_pokemons = [
    "pikachu_block",
    "charizard_block",
    "bulbasaur_block",
    "squirtle_block",
    "jigglypuff_block",
    "geodude_block",
    "gengar_block",
    "eevee_block",
    "snorlax_block",
    "mewtwo_block"
]

# Caminho base para a pasta resources (Padrão do Forge/IntelliJ)
base_path = os.path.join("src", "main", "resources", "assets", MOD_ID)

# ================================================

def criar_pastas():
    paths = [
        os.path.join(base_path, "blockstates"),
        os.path.join(base_path, "models", "block"),
        os.path.join(base_path, "models", "item"),
        # Criamos a pasta de texturas também só para garantir, mas você tem que por a imagem lá
        os.path.join(base_path, "textures", "block")
    ]

    for p in paths:
        if not os.path.exists(p):
            os.makedirs(p)
            print(f"Pasta criada: {p}")

def gerar_json_blockstate(nome):
    content = {
        "variants": {
            "": { "model": f"{MOD_ID}:block/{nome}" }
        }
    }
    salvar_arquivo("blockstates", nome, content)

def gerar_json_model_block(nome):
    content = {
        "parent": "minecraft:block/cube_all",
        "textures": {
            "all": f"{MOD_ID}:block/{nome}"
        }
    }
    salvar_arquivo(os.path.join("models", "block"), nome, content)

def gerar_json_model_item(nome):
    content = {
        "parent": f"{MOD_ID}:block/{nome}"
    }
    salvar_arquivo(os.path.join("models", "item"), nome, content)

def salvar_arquivo(subpasta, nome, conteudo):
    # O caminho completo do arquivo
    caminho_final = os.path.join(base_path, subpasta, f"{nome}.json")

    with open(caminho_final, 'w') as f:
        json.dump(conteudo, f, indent=2) # indent=2 deixa o JSON bonitinho e legível

    print(f"Arquivo gerado: {subpasta}/{nome}.json")

def main():
    print(f"--- Iniciando gerador para o Mod ID: {MOD_ID} ---")
    criar_pastas()

    for pokemon in lista_pokemons:
        print(f"\nProcessando: {pokemon}...")
        gerar_json_blockstate(pokemon)
        gerar_json_model_block(pokemon)
        gerar_json_model_item(pokemon)

    print("\n--- Processo Concluído! ---")
    print("LEMBRETE: Copie suas imagens .png para a pasta:")
    print(f"{base_path}/textures/block/")
    print("Os nomes das imagens devem ser iguais aos nomes da lista (ex: pikachu_block.png)")

if __name__ == "__main__":
    main()