
import java.text.DecimalFormat;
import javax.swing.JOptionPane;

public class EmployeeSimulation {

    public static void main(String[] args) {

        int employee = 1;
        double gross = 0;
        String endFlag = "";
        int i = 0;

        DecimalFormat df = new DecimalFormat("0.00");

        // Required 1D Arrays
        double[] pr = {200, 300, 400, 500, 600, 700, 800, 900, 1000};
        char[] cl = {'A', 'B', 'C', 'D', 'E', 'F', 'G', 'H', 'I'};
        int[] clNo = new int[cl.length];

        System.out.println("---------- TRYING SIMULATION ----------");

        while (true) {

            try {
                gross = Double.valueOf(JOptionPane.showInputDialog("Employee " + employee + " gross:"));
            } catch (Exception e) {
                System.out.println("----------  SIMULATION FAIL  ----------");
                break;
            }

            if (gross < 200 || gross > 100000) {
                System.out.println("----------  SIMULATION FAIL  ----------");
                break;

            } else {

                System.out.println("EMPLOYEE #" + employee);
                System.out.println("Week Gross " + employee + ": " + df.format(gross));
                System.out.println("Week Bonus " + employee + ": " + df.format(gross * 0.09));
                System.out.println("Week Total " + employee + ": " + df.format((gross * 0.09) + 200));

                if (((gross * 0.09) + 200) >= 1000 && ((gross * 0.09) + 200) <= 100000) {
                    clNo[clNo.length - 1]++;
                    System.out.println("Classification " + employee + ": " + cl[cl.length - 1]);

                } else {

                    for (i = 0; i < pr.length; i++) {
                        if (((gross * 0.09) + 200) >= pr[i] && ((gross * 0.09) + 200) <= pr[i] + 99) {
                            clNo[i]++;
                            System.out.println("Classification " + employee + ": " + cl[i]);
                        }
                    }

                }

            }

            try {
                endFlag = JOptionPane.showInputDialog("Enter another Employee?\n[0] Yes\n[1] No");

            } catch (Exception e) {
                System.out.println("----------  SIMULATION FAIL  ----------");
                break;
            }

            System.out.println("----------");
            if (endFlag.toLowerCase() == "yes" || Integer.parseInt(endFlag) == 0) {
                employee++;

            } else if (endFlag.toLowerCase() == "no" || Integer.parseInt(endFlag) == 1) {

                for (i = 0; i < clNo.length; i++) {
                    System.out.println("There are " + clNo[i] + " employees in class " + cl[i] + ".");
                }
                System.out.println("---------- SIMULATION SUCCESSFUL ----------");
                break;

            } else {
                System.out.println("----------  SIMULATION FAIL  ----------");
                break;
            }

        }

    }
}
