package Detyra2;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

    public class CompareTextFiles{
        public static void main(String[] args) throws IOException{

            BufferedReader reader1 = new BufferedReader(new FileReader("C:\\Users\\Lenovo\\IdeaProjects\\AnalizaEAlgoritmeve\\src\\Detyra1/file1.txt"));
            BufferedReader reader2 = new BufferedReader(new FileReader("C:\\Users\\Lenovo\\IdeaProjects\\AnalizaEAlgoritmeve\\src\\Detyra1/file2.txt"));

            String line1 = reader1.readLine();
            String line2 = reader2.readLine();

            boolean areEqual = true;
            int lineNum = 1;

            while (line1 != null || line2 != null){
                if(line1 == null || line2 == null){
                    areEqual = false;
                    break;
                }
                else if(!line1.equalsIgnoreCase(line2)){
                    areEqual = false;
                    break;
                }

                line1 = reader1.readLine();
                line2 = reader2.readLine();
                lineNum++;

            }

            if(areEqual){
                System.out.println("Të dy files kanë përmbajtjen e njëjtë tekstuale.");
                System.out.println("Të dy skedarët kanë përmbajtje të njëjtë tek rreshti:' "+lineNum+" '");

            }
            else{
                System.out.println("Të dy skedarët kanë përmbajtje të ndryshme. Ata ndryshojnë tek rreshti:' "+lineNum+" '");
                System.out.println("File1 ka :'"+line1+"' dhe File2 ka:'\n"+line2+"' tek fjalia(rreshti,line):' "+lineNum+" '");
            }
            reader1.close();
            reader2.close();
        }
        public double time_second(){
            double time = System.currentTimeMillis();
            System.out.println("Koha e ekzekutimit në sekonda: " + ((time)/ 1000));

            return ((time)/1000);
        }
        public double time_millis(){
            System.out.println("Koha e ekzekutimit në milisekonda: ");
            System.out.println(System.currentTimeMillis());
            return System.currentTimeMillis();
        }
        public double time_microsecond() {

            double time = System.currentTimeMillis();
            System.out.println("Koha e ekzekutimit në mikrosekonda: " + ((time)* 1000));

            return ((time)*1000);
        }
        public double time_nano(){
            if(true) {
                System.out.println("Koha e ekzekutimit në nanosekonda: ");
                System.out.println(System.nanoTime());
            }
            return System.nanoTime();
        }
        public double time_picosecond() {

            double time = System.nanoTime();
            System.out.println("Koha e ekzekutimit në pikosekonda: " + ((time)*1000));

            return ((time)*1000);
        }
    }

