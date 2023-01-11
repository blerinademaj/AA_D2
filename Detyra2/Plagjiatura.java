package Detyra2;

public class Plagjiatura{

   public boolean[] fjalitengjashme(String[] t1, String[] t2){
    int min;
       if(t1.length>t2.length){
           min=t2.length;
       }
          else{
                min=t1.length;
       }
        boolean[] b=new boolean[min];
        for(int i=0;i<min;i++){
            if(t1[i].equals(t2[i])){
                b[i]=true;
            }
        }
    return b;
  }
    public int[] algoritmi(String[] t1, String[] t2){

       String[] t;
       if(t1.length<t2.length){
           t=t2;
       }else{t=t1;}

       int[] ndryshore = new int[t.length];

        for(int i=0;i<t.length;i++){
             for(int j=0;j<t1.length;j++){
                 if(t[i].equals(t1[j])){
                     ndryshore[i] = ndryshore[i] + 1;
                 }
            }
        }
        for(int i=0;i<t.length;i++){
            for(int j=0;j<t2.length;j++){
                if(t[i]==t2[j]){
                    ndryshore[i] = ndryshore[i]-1;
                }
            }
        }
        return ndryshore;
    }
    public double[] numerotrue(boolean[] b){

        double[] numritrue = {b.length,0};
        for(int i=0;i<b.length;i++){
            if(b[i]==true){
                numritrue[1] = numritrue[1] + 1.0;
            }
        }
        return numritrue;
    }
    public double[] numerozero(int[] b){
        double[] numritrue = {b.length,0};
        for(int i=0;i<b.length;i++){
            if(b[i]==0){
                numritrue[1] = numritrue[1]+1.0;
            }
        }
        return numritrue;
    }
    public void kontrollo(boolean[] b,int[] a){
        if((numerozero(a)[1]/numerozero(a)[0])>0.5 || (numerotrue(b)[1]/numerotrue(b)[0])>0.5){
            System.out.println("Përmbajtja tekstuale posedon përmbajtje tekstuale të vjedhur pa të drejtë autoriale.");
        }
        else{
            System.out.println("Përmbajtja tekstuale posedon përmbajtje tekstuale origjinale me të drejtë autoriale.");
        }
    }
}
