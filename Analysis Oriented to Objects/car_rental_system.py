class Automovel:
    def __init__(self, placa, cor, ano, tipo_combustivel, num_portas, quilometragem, renavam, chassi, valor_locacao):
        self.placa = placa
        self.cor = cor
        self.ano = ano
        self.tipo_combustivel = tipo_combustivel
        self.num_portas = num_portas
        self.quilometragem = quilometragem
        self.renavam = renavam
        self.chassi = chassi
        self.valor_locacao = valor_locacao
        self.status = "Disponivel"

    def alugar(self, cliente):
        self.status = "Locado"

    def devolver(self):
        self.status = "Disponivel"

    def obter_disponibilidade(self):
        return self.status

class Modelo:
    def __init__(self, nome, descricao, marca):
        self.nome = nome
        self.descricao = descricao
        self.marca = marca

    def obter_carros(self):

class Marca:
    def __init__(self, nome, descricao):
        self.nome = nome
        self.descricao = descricao

    def obter_modelos(self):

class Cliente:
    def __init__(self, nome, cpf, endereco, telefone, email):
        self.nome = nome
        self.cpf = cpf
        self.endereco = endereco
        self.telefone = telefone
        self.email = email

    def alugar_carro(self, automovel):
        automovel.alugar(self)

    def devolver_carro(self, automovel):
        automovel.devolver()

    def obter_historico_locacoes(self):

class Locacao:
    def __init__(self, data_hora_locacao, data_hora_devolucao, cliente, automovel, valor_total):
        self.data_hora_locacao = data_hora_locacao
        self.data_hora_devolucao