package testemaquina;

public class WinnerState implements State {

    MaquinaDeBolinhas maquinaDeBolinhas;

    public WinnerState(MaquinaDeBolinhas maquinaDeBolinhas) {
        this.maquinaDeBolinhas = maquinaDeBolinhas;
    }

    public void insertQuarter() {
        System.out.println("Aguarde,estamos liberando uma bolinha de Borracha");
    }

    public void ejectQuarter() {
        System.out.println("Você já girou a manivela não é mais possivel realizar essa ação");
    }

    public void turnCrank() {
        System.out.println("Você já girou a manivela, espera a liberação da bolinha de borracha");
    }

    public void dispense() {
        System.out.println("Parabéns você é o ganhador!!!, você receberá 2 bolinhas de borracha ao invés de 1");
        maquinaDeBolinhas.releaseBall();
        maquinaDeBolinhas.releaseBall();
        if (maquinaDeBolinhas.getCount() > 0) {
            maquinaDeBolinhas.setState(maquinaDeBolinhas.getNoQuarterState());
            System.out.println("Numero de bolinhas de borrachas restantes: " + maquinaDeBolinhas.getCount());
        } else {
            maquinaDeBolinhas.setState(maquinaDeBolinhas.getSoldOutState());
            System.out.println("Numero de bolinhas de borrachas restantes: " + maquinaDeBolinhas.getCount());
            System.out.println("Máquina Esgotada");
        }
    }

}
