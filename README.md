# Projeto_DB

A simple project made for a school subject, it is a work order system with a focus on the computer area.
(Um projeto simples feito para uma matéria escolar, se trata de um sistema de ordem de serviço com foco na área da informática.)

### Diagram (Diagrama)

![alt text](https://raw.githubusercontent.com/MateusGX/projeto_db/main/imgs/diagram.png "Diagram")

### Data Dictionary (Dicionário de Dados)

#### clientes
| Column name | DataType | PK | FK | NN | UQ | BIN | UN | ZF | AI | Default | Comment |
| ----------- | -------- | -- | -- | -- | -- | --- | -- | -- | -- | ------- | ------- | 
| id          | INT          | X |  | X |  |  |  |  |X |  |  | 
| endereco    | VARCHAR(255) |  |  | X |  |  |  |  |  |  |  | 
| email       | VARCHAR(255) |  |  | X |  |  |  |  |  |  |  | 
| nome        | VARCHAR(255) |  |  | X | X |  |  |  |  |  |  | 

#### ordens_servico
| Column name | DataType | PK | FK | NN | UQ | BIN | UN | ZF | AI | Default | Comment |
| ----------- | -------- | -- | -- | -- | -- | --- | -- | -- | -- | ------- | ------- | 
| id          | INT          | X |  | X |  |  |  |  |X |  |  | 
| data    | TIMESTAMP(4) |  |  | X |  |  |  |  |  |  |  | 
| equipamento       | VARCHAR(255) |  |  | X |  |  |  |  |  |  |  | 
| defeito        | VARCHAR(255) |  |  | X |  |  |  |  |  |  |  | 
| servico    | VARCHAR(255) |  |  | X |  |  |  |  |  |  |  | 
| tecnico       | VARCHAR(255) |  |  | X |  |  |  |  |  |  |  | 
| valor        | DECIMAL(19,4) |  |  | X |  |  |  |  |  |  |  | 
| cliente_id        | INT |  | X | X |  |  |  |  |  |  |  | 

#### usuarios
| Column name | DataType | PK | FK | NN | UQ | BIN | UN | ZF | AI | Default | Comment |
| ----------- | -------- | -- | -- | -- | -- | --- | -- | -- | -- | ------- | ------- | 
| id          | INT          | X |  | X |  |  |  |  |X |  |  | 
| tipo    | VARCHAR(255) |  |  | X |  |  |  |  |  |  |  |
| telefone    | VARCHAR(255) |  |  | X |  |  |  |  |  |  |  | 
| login       | VARCHAR(255) |  |  | X |  |  |  |  |  |  |  | 
| senha        | VARCHAR(255) |  |  | X |  |  |  |  |  |  |  | 
