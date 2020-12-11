package testemaquina;

public class SoldOutState implements State {

    MaquinaDeBolinhas maquinaDeBolinhas;

    public SoldOutState(MaquinaDeBolinhas maquinaDeBolinhas) {
        this.maquinaDeBolinhas = maquinaDeBolinhas;
    }

    public void insertQuarter() {
        System.out.println("Você não pode inserir moeda,a máquina está esgotada");
    }

    public void ejectQuarter() {
        System.out.println("Você não tinha inserido uma moeda");
    }

    public void turnCrank() {
        System.out.println("você girou a manivela,mas a máquina está esgotada");
    }

    public void dispense() {
        System.out.println("Máquina Esgotada");
    }

    public String toString() {
        return "Máquina Esgotada!";
    }
}
