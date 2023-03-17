public class OperadorLogicoOR {
    //financiar a casa
    public static void main(String[] args){
        boolean temEmprego = true;
        boolean temEmpresa = true;
        boolean tem50K = true;
        boolean podeFinanciar = temEmprego || temEmpresa && tem50K;
        System.out.println(podeFinanciar);
    }


}
