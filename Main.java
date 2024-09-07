import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {

    public abstract static class Empleado {
        protected String nombre;
        protected String id;
        protected double salarioBase;

        public Empleado(String nombre, String id, double salarioBase) {
            this.nombre = nombre;
            this.id = id;
            this.salarioBase = salarioBase;
        }

        public abstract double calcularSalario();

        public void mostrarInformacion() {
            System.out.println("Nombre: " + nombre);
            System.out.println("ID: " + id);
            System.out.println("Salario Base: " + salarioBase);
        }
    }

    public static class Gerente extends Empleado {
        private double bonoAnual;

        public Gerente(String nombre, String id, double salarioBase, double bonoAnual) {
            super(nombre, id, salarioBase);
            this.bonoAnual = bonoAnual;
        }

        @Override
        public double calcularSalario() {
            return salarioBase + bonoAnual;
        }

        @Override
        public void mostrarInformacion() {
            super.mostrarInformacion();
            System.out.println("Bono Anual: " + bonoAnual);
        }
    }

    public static class Desarrollador extends Empleado {
        private int proyectosAsignados;

        public Desarrollador(String nombre, String id, double salarioBase, int proyectosAsignados) {
            super(nombre, id, salarioBase);
            this.proyectosAsignados = proyectosAsignados;
        }

        @Override
        public double calcularSalario() {
            return salarioBase + (proyectosAsignados * 50000); 
        }
        

        @Override
        public void mostrarInformacion() {
            super.mostrarInformacion();
            System.out.println("Proyectos Asignados: " + proyectosAsignados);
        }
    }

    public static class Administrativo extends Empleado {
        private int horasExtra;

        public Administrativo(String nombre, String id, double salarioBase, int horasExtra) {
            super(nombre, id, salarioBase);
            this.horasExtra = horasExtra;
        }

        @Override
        public double calcularSalario() {
            double tarifaPorHora = (salarioBase / 30) / 8;
            double recargoPorHoraExtra = tarifaPorHora * 1.25; 
            return salarioBase + (horasExtra * recargoPorHoraExtra);
        }

        @Override
        public void mostrarInformacion() {
            super.mostrarInformacion();
            System.out.println("Horas Extra: " + horasExtra);
        }
    }

    public static class GestionPersonal {
        
        public void generarInforme(List<Empleado> empleados) {
            for (Empleado empleado : empleados) {
                empleado.mostrarInformacion();
                System.out.println("Salario Total: " + empleado.calcularSalario());
                System.out.println("-------------------------------");
            }
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        List<Empleado> empleados = new ArrayList<>();
        GestionPersonal gestionPersonal = new GestionPersonal();

        System.out.println("¿Cuántos empleados desea agregar?");
        int numEmpleados = scanner.nextInt();
        scanner.nextLine(); 

        for (int i = 0; i < numEmpleados; i++) {
            System.out.println("¿Qué tipo de empleado desea agregar? (1 = Gerente, 2 = Desarrollador, 3 = Administrativo)");
            int tipo = scanner.nextInt();
            scanner.nextLine(); 

            System.out.print("Introduce el nombre del empleado: ");
            String nombre = scanner.nextLine();

            System.out.print("Introduce el ID del empleado: ");
            String id = scanner.nextLine();

            System.out.print("Introduce el salario base del empleado: ");
            double salarioBase = scanner.nextDouble();

            if (tipo == 1) {
                System.out.print("Introduce el bono anual del empleado: ");
                double bonoAnual = scanner.nextDouble();
                empleados.add(new Gerente(nombre, id, salarioBase, bonoAnual));
            } else if (tipo == 2) {
                System.out.print("Introduce el número de proyectos asignados: ");
                int proyectosAsignados = scanner.nextInt();
                empleados.add(new Desarrollador(nombre, id, salarioBase, proyectosAsignados));
            } else if (tipo == 3) {
                System.out.print("Introduce el número de horas extras del empleado: ");
                int horasExtra = scanner.nextInt();
                empleados.add(new Administrativo(nombre, id, salarioBase, horasExtra));
            }

            System.out.println("El empleado fue agregado correctamente.\n");
        }

        System.out.println("\n--- Informe de Salarios ---");
        gestionPersonal.generarInforme(empleados);

        scanner.close();
    }
}
