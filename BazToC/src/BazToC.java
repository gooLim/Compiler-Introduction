import java.io.*;

public class BazToC {
    public static void main(String[] args) throws IOException {
        File inFile = new File("BazToC/test.baz");
        File outFile = new File("BazToC/test.c");

        FileWriter fileWriter = new FileWriter(outFile, true);
        fileWriter.write("#include <stdio.h>\n");
        fileWriter.write("enum baz_val {TRUE, FALSE, BAZ};\n");
        fileWriter.write("void baz_print(enum baz_val v) {\n");
        fileWriter.write("if (v == TRUE)\n");
        fileWriter.write("\tswitch(v) {\n");
        fileWriter.write("\t\tcase TRUE:\n");
        fileWriter.write("\t\t\tprintf(\"TRUE\\n\");\n");
        fileWriter.write("\t\t\tbreak;\n");
        fileWriter.write("\t\tcase FALSE:\n");
        fileWriter.write("\t\t\tprintf(\"FALSE\\n\");\n");
        fileWriter.write("\t\t\tbreak;\n");
        fileWriter.write("\t\tcase BAZ:\n");
        fileWriter.write("\t\t\tprintf(\"BAZ\\n\");\n");
        fileWriter.write("\t\t\tbreak;\n");
        fileWriter.write("\t}\n\n");
        fileWriter.write("else  printf(\"YOU ARE WRONG!\\n\");\n");
        fileWriter.write("}\n\n");

        fileWriter.write("int main(){\n");

        BufferedReader bufferedReader = new BufferedReader(new FileReader(inFile));
        String line = null;
        while((line = bufferedReader.readLine()) != null){
            String[] str = line.split(" ");
            if(str.length > 1)
                str[1] = str[1].equals("true") || str[1].equals("false") ? str[1].toUpperCase() : str[1];
            if(str[0].equals("show")){
                fileWriter.write("baz_print("+str[1]+");\n");
            }
            else if(str[0].equals("get")){

            }
            else if(str[0].equals("if")){

                fileWriter.write("if ("+str[1]+" == TRUE) {\n");
            }
            else if(str[0].equals("if!")){

                fileWriter.write("if ("+str[1]+" == FALSE) {\n");
            }
            else if(str[0].equals("endif")){
                fileWriter.write("}\n\n");
            }
            else if(str[0].equals("end")){
                fileWriter.write("return 1;\n}");
            }
            else if(str[1].equals("=")){
                fileWriter.write("enum baz_val "+str[0]+" = "+str[2].toUpperCase()+";\n");
            }
        }
        fileWriter.flush();
    }
}
