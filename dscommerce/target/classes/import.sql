INSERT INTO tb_category(name) VALUES ('Livros');
INSERT INTO tb_category(name) VALUES ('Eletrônicos');

INSERT INTO tb_product(name, description, price, img_url) VALUES ('Senhor do Anéis', 'Este livro tem um universo fantástico', 300.0, 'https://livros.com');

INSERT INTO tb_product_category(product_id, category_id) VALUES (1, 1);