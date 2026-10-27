public class Cliente{
    public static void main(String[] args){
        //strategy é invocada por objetos preexistentes
        calcContext context = new calcContext(new addStrategy());
        int resultado = calcContext.executeStrategy(10, 15);
        System.out.println("resultado" + resultado);

        //trocar strategy
        calcContext.setStrategy(new subStrategy());
        resultado = calcContext.executeStrategy(10, 15);
        System.out.println("resultado: " +resultado);
    }
}