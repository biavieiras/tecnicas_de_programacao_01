class Pessoa {
  private String nome;
  private int idade;
  private char sexo;

  Pessoa (String nome) {
  this("Sem nome", 0, '');
  }

  Pessoa (String nome) {
    this(nome, 0, '');
  }

  Pessoa (String nome) {
    this(nome, idade, '');
  }

  Pessoa (String nome, int idade, char sexo) {
    this.setNome(nome);