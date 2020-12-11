package testemaquina;

public class TesteMaquina {

    public static void main(String[] args) {
        MaquinaDeBolinhas mb = new MaquinaDeBolinhas(5);
        mb.insertQuarter();
        mb.ejectQuarter();
        mb.insertQuarter();
        mb.turnCrank();
        mb.turnCrank();
        mb.ejectQuarter();
        mb.insertQuarter();
        mb.turnCrank();
        
        
        
        
    }

}
