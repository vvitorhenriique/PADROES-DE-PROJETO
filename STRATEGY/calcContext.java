public class calcContext{
    //atributo para manter strategy

    Strategy strategy;

    //construtor com dependecia da strategy
    public calcContext(Strategy strategy){

    }

    //metodo para substituir a strategy
    public void setStrategy(Strategy strategy){
        this.strategy = strategy;
    }   

    //metodo para chamar execute da strategy
    public int executeStrategy(int a, int b){
        return strategy.execute(a, b);
    }

}