# 🤖 Protocolo Cyber-City (Robotics System)

Este projeto consiste no desenvolvimento do núcleo lógico (**Core**) de um sistema de gestão de robôs para a corporação *TechDynamics*.

O foco principal é a aplicação de **Arquitetura de Software**, **SOLID**, **Clean Code** e **Gestão de Recursos (Energia)**.

## 📋 Sobre o Projeto

O sistema simula uma frota de robôs autônomos onde cada unidade possui custos energéticos específicos para operar. O desafio técnico envolve garantir que as regras de negócio (bateria, especialização e status) sejam respeitadas através de um design robusto.

### Tecnologias e Práticas
* **Java 17+** (Core puro, sem frameworks)
* **POO Avançada** (Polimorfismo, Abstração, Composição)
* **SOLID** (Foco em SRP, OCP e ISP)
* **Design Patterns** (Strategy, Singleton/Utility, Rich Enum)
* **Fail Fast** (Tratamento de exceções personalizado)

---

## ⚙️ Regras de Negócio

### 1. Tipos de Robôs e Especializações
O sistema gerencia três modelos de unidades:

| Modelo | Especialização | Capacidade Única |
| :--- | :--- | :--- |
| **Drone** | Vigilância Aérea | Pode Voar (`Flyable`) e Atacar (`Fightable`) |
| **Mech** | Combate Pesado | Pode Atacar (`Fightable`) |
| **Androide** | Auxiliar | Pode Trabalhar (`Workable`) |

### 2. Sistema de Energia (Bateria)
* Todo robô possui uma bateria com capacidade máxima definida pelo seu modelo.
* Cada ação (Atacar, Voar, Trabalhar) consome uma porcentagem fixa de energia.
* **Regra Crítica:** O sistema deve impedir qualquer ação caso a bateria seja insuficiente, lançando uma exceção.

---

## 🔧 Estrutura do Projeto

O código está organizado seguindo o padrão de domínio:

```text
src/com/daniel/robotics/
├── app/          # Ponto de entrada (Main)
├── domain/       # Entidades (Robot, Battery, Enums)
├── service/      # Regras de Negócio e Orquestração
└── exceptions/   # Exceções personalizadas (Fail Fast)