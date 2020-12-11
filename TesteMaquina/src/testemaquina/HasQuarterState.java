package testemaquina;

import java.util.Random;

public class HasQuarterState implements State {

    Random random = new Random(System.currentTimeMillis());
    MaquinaDeBolinhas maquinaDeBolinhas;

    public HasQuarterState(MaquinaDeBolinhas maquinaDeBolinhas) {
        this.maquinaDeBolinhas = maquinaDeBolinhas;
    }

    public void insertQuarter() {
        System.out.println("Você não pode inserir outra moeda");
    }

    public void ejectQuarter() {
        System.out.println("Você ejetou a moeda");
        maquinaDeBolinhas.setState(maquinaDeBolinhas.getNoQuarterState());
    }

    public void turnCrank() {
        System.out.println("você girou a manivela com uma moeda inserida");
        int ganhador = random.nextInt(10);
       
        if ((ganhador == 1) && (maquinaDeBolinhas.getCount() > 1)) {
            maquinaDeBolinhas.setState(maquinaDeBolinhas.getWinnerState());
        } else {
            maquinaDeBolinhas.setState(maquinaDeBolinhas.soldState);
        }
    }

    public void dispense() {
        System.out.println("você precisa pagar primeiro");
    }

    public String toString() {
        return "Já tem uma moeda";
    }
}
