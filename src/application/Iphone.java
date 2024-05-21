package application;
import interfaces.Telefone;

public class Iphone implements Telefone{ 
    public void ligar () {
        System.out.println("Fazendo ligação");
    } 
    public void atender () {
        System.out.println("Atendendo ligação");
    } 
    public void iniciarCorreioVoz () {
        System.out.println("Iniciando correio de voz");
    }
}
