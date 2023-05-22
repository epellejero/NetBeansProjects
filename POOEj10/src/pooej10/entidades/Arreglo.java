/*
 * Realizar un programa en Java donde se creen dos arreglos: el primero será un
 * arreglo A de 50 números reales, y el segundo B, un arreglo de 20 números, 
 * también reales. El programa deberá inicializar el arreglo A con números 
 * aleatorios y mostrarlo por pantalla.
 * Luego, el arreglo A se debe ordenar de menor a mayor y copiar los primeros 
 * 10 números ordenados al arreglo B de 20 elementos, y rellenar los 10 últimos
 * elementos con el valor 0.5. Mostrar los dos arreglos resultantes: el ordenado
 * de 50 elementos y el combinado de 20.
 */
package pooej10.entidades;

public class Arreglo {
    private double arregloA[];
    private double arregloB[];

    public Arreglo() {
    }
    public Arreglo(double[] arregloA, double[] arregloB) {
        this.arregloA = arregloA;
        this.arregloB = arregloB;
    }

    public double[] getArregloA() {
        return arregloA;
    }
    public void setArregloA(double[] arregloA) {
        this.arregloA = arregloA;
    }
    public double[] getArregloB() {
        return arregloB;
    }
    public void setArregloB(double[] arregloB) {
        this.arregloB = arregloB;
    }
    
    public void cargarArregloA(int dimensionA){
        double vectorA[] = new double[dimensionA];
        for (int i = 0; i < dimensionA; i++) {
            vectorA[i] = Math.round(Math.random() * 10);
        }
        setArregloA(vectorA);
    }
    
    public void mostrarArregloA(int dimensionA){
//        Arrays.sort(arreglo);
//        System.out.print(String.format("%.2f",arreglo[i])+" ");
//        Arrays.fill(arreglo2,10,20,0.5); desde la posicion 10 a la 20 lleno con 0.5


        System.out.println("Mostrar arregloA ----------------------");
        double vectorA[] = new double[dimensionA];
        vectorA = getArregloA();
        for (int i = 0; i < dimensionA; i++) {
            System.out.print("[" + vectorA[i] + "] ");
            if ((i+1) % 10 == 0){
                System.out.println("");
            }
        }
    }
    
    public void mostrarArregloB(int dimensionB){
        System.out.println("Mostrar arregloB ----------------------");
        double vectorB[] = new double[dimensionB];
        vectorB = getArregloB();
        for (int i = 0; i < dimensionB; i++) {
            System.out.print("[" + vectorB[i] + "] ");
            if ((i+1) % 10 == 0){
                System.out.println("");
            }
        }
    }
    
    public void ordenarArregloA(int dimensionA){
        double vectorA[] = new double[dimensionA];
        double temp;
        System.out.println("Ordenar arregloA  -----------------------");
        vectorA = getArregloA();
        for (int i = 0; i < dimensionA; i++) {
        	for (int j = 0; j < dimensionA; j++) {
		if (vectorA[i] < vectorA[j]) {
			temp = vectorA[i];
			vectorA[i] = vectorA[j];
			vectorA[j] = temp;
				}
			}
		}
        for (int i = 0; i < dimensionA; i++) {
            System.out.print("[" + vectorA[i] + "] ");
            if ((i+1) % 10 == 0){
                System.out.println("");
            }
        }
        setArregloA(vectorA);
    }
    
    public void cargarArregloB(int dimensionB, int dimensionA){
        double vectorB[] = new double[dimensionB];
        double vectorA[] = new double[dimensionA];
        vectorA = getArregloA();
        for (int i = 0; i < dimensionB; i++) {
            if (i < 10){
                vectorB[i] = vectorA[i];
            } else {
                vectorB[i] = 0.5;
            }
        }
        setArregloB(vectorB);
    }
    
}
