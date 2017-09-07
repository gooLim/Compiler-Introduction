import java.io.*;

public class BazToC {
    public static void main(String[] args) throws IOException {
        File inFile = new File("BazToC/test.baz");
        File outFile = new File("BazToC/test.c");

        FileWriter fileWriter = new FileWriter(outFile, true);
        fileWriter.write("#include <stdio.h>\n");
        fileWriter.write("#include <stdlib.h>\n");
        fileWriter.write("#include <string.h>\n");
        fileWriter.write("#include <time.h>\n");
        fileWriter.write("enum baz_val {TRUE, FALSE, BAZ};\n");
        fileWriter.write("void baz_print(enum baz_val v) {\n");
        fileWriter.write("if (v == TRUE)\n");
        fileWriter.write("\tprintf(\"TRUE\\n\");\n");
        fileWriter.write("else if (v == FALSE)\n");
        fileWriter.write("\tprintf(\"FALSE\\n\");\n");
        fileWriter.write("else if (v == BAZ)\n");
        fileWriter.write("\tprintf(\"BAZ\\n\");\n");
        fileWriter.write("else  printf(\"YOU ARE WRONG!\\n\");\n");
        fileWriter.write("}\n\n");

        fileWriter.write("int main(){\n");
        fileWriter.write("srand(time(NULL));\n");
        BufferedReader bufferedReader = new BufferedReader(new FileReader(inFile));
        String line = null;
        while((line = bufferedReader.readLine()) != null){
            String[] str = line.split(" ");
            if(str.length > 1)
                str[1] = (str[1].equals("true") || str[1].equals("false")) || str[1].equals("baz") ? str[1].toUpperCase() : str[1];
            if(str[0].equals("show")){
                fileWriter.write("baz_print("+str[1]+");\n");
            }
            else if(str[0].equals("get")){
                fileWriter.write("char temp[10];\n");
                fileWriter.write("enum baz_val "+str[1]+";\n");
                fileWriter.write("scanf(\"%s\", temp);\n");
                fileWriter.write("if (!strcmp(temp,\"true\"))\n");
                fileWriter.write("\t"+str[1]+" = TRUE;\n");
                fileWriter.write("else if (!strcmp(temp,\"false\"))\n");
                fileWriter.write("\t"+str[1]+" = FALSE;\n");
                fileWriter.write("else if (!strcmp(temp,\"baz\"))\n");
                fileWriter.write("\t"+str[1]+" = BAZ;\n");
                fileWriter.write("else  printf(\"YOU ARE WRONG!\\n\");\n");

            }
            else if(str[0].equals("if")){
                fileWriter.write("int temp = 0;\n");
                fileWriter.write("if ("+str[1]+" == BAZ) \n");
                fileWriter.write("\t temp = rand()%2;\n");
                fileWriter.write("if ("+str[1]+" == TRUE || temp) {\n");
            }
            else if(str[0].equals("if!")){
                fileWriter.write("int temp = 0;\n");
                fileWriter.write("if ("+str[1]+" == BAZ) \n");
                fileWriter.write("\t temp = rand()%2;\n");
                fileWriter.write("if ("+str[1]+" == FALSE || !temp) {\n");
            }
            else if(str[0].equals("endif")){
                fileWriter.write("}\n\n");
            }
            else if(str[0].equals("end")){
                fileWriter.write("return 1;\n");
            }
            else if(str[1].equals("=")){
                fileWriter.write("enum baz_val "+str[0]+" = "+str[2].toUpperCase()+";\n");
            }
        }
        fileWriter.write("}\n");
        fileWriter.flush();
    }
}
