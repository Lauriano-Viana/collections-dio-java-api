package main.java.set.operacoesBasica;

import java.util.HashSet;
import java.util.Set;

public class ConjuntoConvidados {
    private Set<Convidado> convidadoSet;

    public ConjuntoConvidados() {
        this.convidadoSet = new HashSet<>();
    }

    public void adicionarConvidado(String nome, int codigoConvite) {
        convidadoSet.add(new Convidado(nome, codigoConvite));
    }

    public void removerConvidadoPorCodigoConvite(int codigoConvite) {
        Convidado convidadoParaRemover = null;
        for (Convidado c : convidadoSet) {
            if (c.getCodigoConvite() == codigoConvite) {
                convidadoParaRemover = c;
                break;
            }
        }
        convidadoSet.remove(convidadoParaRemover);
    }

    public int contarConvidados(){
        return convidadoSet.size();
    }

    public void exibirConvidados(){
        System.out.println(convidadoSet);
    }

    public static void main(String[] args) {
        ConjuntoConvidados conjuntoConvidados = new ConjuntoConvidados();
        System.out.println("Existe(m) " + conjuntoConvidados.contarConvidados() + " convidado(s).");

        conjuntoConvidados.adicionarConvidado("Conv 1",1234);
        conjuntoConvidados.adicionarConvidado("Conv 2",1235);
        conjuntoConvidados.adicionarConvidado("Conv 3",1235);
        conjuntoConvidados.adicionarConvidado("Conv 4",1237);

        System.out.println("Existe(m) " + conjuntoConvidados.contarConvidados() + " convidado(s).");

        conjuntoConvidados.removerConvidadoPorCodigoConvite(1234);
        conjuntoConvidados.exibirConvidados();
    }

}
