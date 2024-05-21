package application;

import interfaces.NavegadorInternet;
import interfaces.ReprodutorMusical;
import interfaces.Telefone;

public class Iphone implements Telefone, ReprodutorMusical, NavegadorInternet {
  @Override
  public void ligar() {
    System.out.println("Fazendo ligação");
  }

  @Override
  public void atender() {
    System.out.println("Atendendo ligação");
  }

  @Override
  public void iniciarCorreioVoz() {
    System.out.println("Iniciando correio de voz");
  }

  @Override
  public void tocar() {
    System.out.println("Tocando música");
  }

  @Override
  public void pausar() {
    System.out.println("Pausando música");
  }

  @Override
  public void selecionarMusica() {
    System.out.println("Selecionando música");
  }

  @Override
  public void exibirPagina() {
    System.out.println("Exibindo página");
  }

  @Override
  public void adicinarNovaAba() {
    System.out.println("Adicionando nova aba");
  }

  @Override
  public void atualizarPagina() {
    System.out.println("atualizando página");
  }
}
