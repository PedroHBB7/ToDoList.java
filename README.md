Necessario xampp para armarezanamento de banco dedados internos no computador, utilize MySQL WorkBench para criar e gerenciar os bancos de dados.
Aqui a seguir o código necessario para a configuração do MySQL Workbench:
-- Criar o banco de dados
CREATE DATABASE IF NOT EXISTS todolist;
USE todolist;

-- Tabela de usuários
CREATE TABLE IF NOT EXISTS usuarios (
    id INT AUTO_INCREMENT PRIMARY KEY,
    nome VARCHAR(100) NOT NULL,
    email VARCHAR(100) UNIQUE NOT NULL,
    senha VARCHAR(255) NOT NULL
);

-- Tabela de tarefas
CREATE TABLE IF NOT EXISTS tarefas (
    id INT AUTO_INCREMENT PRIMARY KEY,
    titulo VARCHAR(255) NOT NULL,
    status ENUM('pendente', 'concluida') DEFAULT 'pendente',
    usuario_id INT,
    FOREIGN KEY (usuario_id) REFERENCES usuarios(id) ON DELETE CASCADE
);

Intruções do que é cada coisa estão adicionadas seguidas por "--" 
elas são ignoradas na linha de comando do MySQL Workbench

 No xampp você deverá ligar o módulo Apache e MySQL.
