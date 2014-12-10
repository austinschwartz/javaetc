package nawns;

import java.io.InputStreamReader;
import java.util.Scanner;

/**
 * Created by nonis_000 on 12/9/2014.
 */
public class Brainfuck {
    public char[] data = new char[3000];
    public char[] prog;
    public int p = 0;
    public InputStreamReader scan;

    public Brainfuck(String x) {
        this.prog = x.toCharArray();
        scan = new InputStreamReader(System.in);
    }

    public void eval() {
        for (int i = 0; i < prog.length; i++) {
            if (prog[i] == '>') p++;
            if (prog[i] == '<') p--;
            if (prog[i] == '+') data[p]++;
            if (prog[i] == '-') data[p]--;
        }
    }

    public static void main(String[] args) {
        String helloworld = ">+++++++++[<++++++++>-]<.>+++++++[<++++>-]<+.+++++++..+++.>>>" +
                "++++++++[<++++>-]<.>>>++++++++++[<+++++++++>-]<---.<<<<.+++.------.--------.>>+.";

        String beer = ">+++++++++[<+++++++++++>-]<[>[-]>[-]<<[>+>+<<-]>>[<<+>>-]>>>" +
                "[-]<<<+++++++++<[>>>+<<[>+>[-]<<-]>[<+>-]>[<<++++++++++>>>+<" +
                "-]<<-<-]+++++++++>[<->-]>>+>[<[-]<<+>>>-]>[-]+<<[>+>-<<-]<<<" +
                "[>>+>+<<<-]>>>[<<<+>>>-]>[<+>-]<<-[>[-]<[-]]>>+<[>[-]<-]<+++" +
                "+++++[<++++++<++++++>>-]>>>[>+>+<<-]>>[<<+>>-]<[<<<<<.>>>>>-" +
                "]<<<<<<.>>[-]>[-]++++[<++++++++>-]<.>++++[<++++++++>-]<++.>+" +
                "++++[<+++++++++>-]<.><+++++..--------.-------.>>[>>+>+<<<-]>" +
                ">>[<<<+>>>-]<[<<<<++++++++++++++.>>>>-]<<<<[-]>++++[<+++++++" +
                "+>-]<.>+++++++++[<+++++++++>-]<--.---------.>+++++++[<------" +
                "---->-]<.>++++++[<+++++++++++>-]<.+++..+++++++++++++.>++++++" +
                "++[<---------->-]<--.>+++++++++[<+++++++++>-]<--.-.>++++++++" +
                "[<---------->-]<++.>++++++++[<++++++++++>-]<++++.-----------" +
                "-.---.>+++++++[<---------->-]<+.>++++++++[<+++++++++++>-]<-." +
                ">++[<----------->-]<.+++++++++++..>+++++++++[<---------->-]<" +
                "-----.---.>>>[>+>+<<-]>>[<<+>>-]<[<<<<<.>>>>>-]<<<<<<.>>>+++" +
                "+[<++++++>-]<--.>++++[<++++++++>-]<++.>+++++[<+++++++++>-]<." +
                "><+++++..--------.-------.>>[>>+>+<<<-]>>>[<<<+>>>-]<[<<<<++" +
                "++++++++++++.>>>>-]<<<<[-]>++++[<++++++++>-]<.>+++++++++[<++" +
                "+++++++>-]<--.---------.>+++++++[<---------->-]<.>++++++[<++" +
                "+++++++++>-]<.+++..+++++++++++++.>++++++++++[<---------->-]<" +
                "-.---.>+++++++[<++++++++++>-]<++++.+++++++++++++.++++++++++." +
                "------.>+++++++[<---------->-]<+.>++++++++[<++++++++++>-]<-." +
                "-.---------.>+++++++[<---------->-]<+.>+++++++[<++++++++++>-" +
                "]<--.+++++++++++.++++++++.---------.>++++++++[<---------->-]" +
                "<++.>+++++[<+++++++++++++>-]<.+++++++++++++.----------.>++++" +
                "+++[<---------->-]<++.>++++++++[<++++++++++>-]<.>+++[<----->" +
                "-]<.>+++[<++++++>-]<..>+++++++++[<--------->-]<--.>+++++++[<" +
                "++++++++++>-]<+++.+++++++++++.>++++++++[<----------->-]<++++" +
                ".>+++++[<+++++++++++++>-]<.>+++[<++++++>-]<-.---.++++++.----" +
                "---.----------.>++++++++[<----------->-]<+.---.[-]<<<->[-]>[" +
                "-]<<[>+>+<<-]>>[<<+>>-]>>>[-]<<<+++++++++<[>>>+<<[>+>[-]<<-]" +
                ">[<+>-]>[<<++++++++++>>>+<-]<<-<-]+++++++++>[<->-]>>+>[<[-]<" +
                "<+>>>-]>[-]+<<[>+>-<<-]<<<[>>+>+<<<-]>>>[<<<+>>>-]<>>[<+>-]<" +
                "<-[>[-]<[-]]>>+<[>[-]<-]<++++++++[<++++++<++++++>>-]>>>[>+>+" +
                "<<-]>>[<<+>>-]<[<<<<<.>>>>>-]<<<<<<.>>[-]>[-]++++[<++++++++>" +
                "-]<.>++++[<++++++++>-]<++.>+++++[<+++++++++>-]<.><+++++..---" +
                "-----.-------.>>[>>+>+<<<-]>>>[<<<+>>>-]<[<<<<++++++++++++++" +
                ".>>>>-]<<<<[-]>++++[<++++++++>-]<.>+++++++++[<+++++++++>-]<-" +
                "-.---------.>+++++++[<---------->-]<.>++++++[<+++++++++++>-]" +
                "<.+++..+++++++++++++.>++++++++[<---------->-]<--.>+++++++++[" +
                "<+++++++++>-]<--.-.>++++++++[<---------->-]<++.>++++++++[<++" +
                "++++++++>-]<++++.------------.---.>+++++++[<---------->-]<+." +
                ">++++++++[<+++++++++++>-]<-.>++[<----------->-]<.+++++++++++" +
                "..>+++++++++[<---------->-]<-----.---.+++.---.[-]<<<]";

        Brainfuck fuck = new Brainfuck(helloworld);
        fuck.eval();
    }

}