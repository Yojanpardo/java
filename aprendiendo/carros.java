/**
 *
 * @author yojan
 */
public class carros {
    private String matricula,motor,color;
    private int numero;

    public void setMatricula(String Matricula){
        matricula=Matricula;
    }
    public void setMotor(String Motor){
        motor=Motor;
    }
    public void setColor(String Color){
        color=Color;
    }
    public void setNumero(int Numero){
        numero=Numero;
    }
    public String getMatricula(){
        return matricula;
    }
    public String getMotor(){
        return motor;
    }
    public String getColor(){
        return color;
    }
    public int getNumero(){
        return numero;
    }
}
