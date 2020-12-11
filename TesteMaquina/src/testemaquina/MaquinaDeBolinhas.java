package testemaquina;

public class MaquinaDeBolinhas {

    State soldOutState;
    State noQuarterState;
    State hasQuarterState;
    State soldState;
    State winnerState;

    State state = soldOutState;
    int count = 0;

    public MaquinaDeBolinhas(int countBalls) {
        soldOutState = new SoldOutState(this);
        noQuarterState = new NoQuarterState(this);
        hasQuarterState = new HasQuarterState(this);
        soldState = new SoldState(this);
        winnerState = new WinnerState(this);

        this.count = countBalls;

        if (countBalls > 0) {
            state = noQuarterState;
        } else {
            state = soldOutState;
        }

    }

    public void insertQuarter() {
        state.insertQuarter();
    }

    public void ejectQuarter() {
        state.ejectQuarter();
    }

    public void turnCrank() {
        state.turnCrank();
        state.dispense();

    }

    public void releaseBall() {
        System.out.println("Lá vem Bolinha de borracha!!!");
        if (count != 0) {
            count = count - 1;
        }

    }

    public State getSoldOutState() {
        return soldOutState;
    }

    public State getNoQuarterState() {
        return noQuarterState;
    }

    public State getHasQuarterState() {
        return hasQuarterState;
    }

    public State getSoldState() {
        return soldState;
    }

    public State getWinnerState() {
        return winnerState;
    }
    

    public int getCount() {
        return count;
    }

    public void setState(State state) {
        this.state = state;
    }
    
    

}
