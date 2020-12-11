package testemaquina;

public class NoQuarterState implements State{
    MaquinaDeBolinhas maquinaDeBolinhas;
    
    public NoQuarterState(MaquinaDeBolinhas maquinaDeBolinhas){
        this.maquinaDeBolinhas = maquinaDeBolinhas;
    }
    
    public void insertQuarter() {
        System.out.println("Você inseriu uma moeda");
        maquinaDeBolinhas.setState(maquinaDeBolinhas.getHasQuarterState());
    }

    
    public void ejectQuarter() {
        System.out.println("Você não tinha inserido uma moeda");
    }

    
    public void turnCrank() {
        System.out.println("você girou a manivela,mas não tinha uma moeda");
    }

    
    public void dispense() {
        System.out.println("você precisa pagar primeiro");
    }
    
    
    public String toString(){
        return "Esperando uma moeda";
    }
}
