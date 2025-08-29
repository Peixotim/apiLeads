--V2 : Migrations arruma o tipo de dado do telefone
ALTER TABLE tb_leads
ALTER COLUMN telefone TYPE VARCHAR(255);