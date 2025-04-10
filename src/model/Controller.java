package model;

import java.util.ArrayList;

public class Controller {

	private ArrayList<int[][]> numericMatrixes;
	private ArrayList<String[][]> stringMatrixes;

	public Controller() {
		numericMatrixes = new ArrayList<int[][]>();
		stringMatrixes = new ArrayList<String[][]>();
	}

	/**
	 * Descripcion: Permite mostrar TODAS las matrices registradas en el sistema
	 * @return El listado de TODAS las matrices registradas en formato String
	 */
	public String getAllMatrixesInfo() {
		
		return getAllNumericMatrixesInfo()+getAllStringMatrixesInfo();
	}

	/**
	 * Descripcion: Permite mostrar las matrices numericas registradas en el sistema
	 * pre: La lista numericMatrixes esta inicializada
	 *
	 * @return El listado de matrices numericas registradas en formato String
	 */
	public String getAllNumericMatrixesInfo() {

		String out = "";

		out += "Numeric matrixes: \n";

		if (!numericMatrixes.isEmpty()) {

			for (int i = 0; i < numericMatrixes.size(); i++) {
				out += "Numeric Matrix "+(i+1)+":\n";
				out += getNumericMatrixInfo(i) + "\n";
			}
		} else {

			out += "There are no numeric matrixes registered yet \n";

		}

		return out;

	}

	/**
	 * Descripcion: Permite mostrar las matrices String registradas en el sistema
	 * pre: La lista stringMatrixes esta inicializada
	 *
	 * @return El listado de matrices de String registradas en formato String
	 */
	public String getAllStringMatrixesInfo() {

		String out = "";
		out += "String matrixes: \n";

		if (!stringMatrixes.isEmpty()) {

			for (int i = 0; i < stringMatrixes.size(); i++) {
				out += "String Matrix "+(i+1)+":\n";
				out += printStringMatrix(i);
			}
		} else {
			out += "There are no String matrixes registered yet \n";
		}

		return out;

	}

	/**
	 * Descripcion: Permite generar una cadena String con el contenido de la matriz
	 * pasada por parametro
	 * 
	 * @param numMatrix La matriz numerica a imprimir
	 * @return El contenido de la matriz en formato String
	 */
	public String getNumericMatrixInfo(int position) {

		int[][] numMatrix = numericMatrixes.get(position);

		String print = "";
		for (int i = 0; i < numMatrix.length; i++) { // filas numbers.length
			for (int j = 0; j < numMatrix[0].length; j++) { // columnas numbers[0].length
				print += numMatrix[i][j] + " ";
			}
			print += "\n";
		}

		return print;
	}

	/**
	 * Descripcion: Permite crear una matriz vacia segun el tipo: 1, numerica (int)
	 * 2, de caracteres (String)
	 * pre: Las listas numericMatrixes y stringMatrixes estan inicializadas
	 * pos: Se agrega la matriz vacia a la lista correspondiente
	 * 
	 * @param type    int variable utilizada para crear la matriz vacía según el
	 *                tipo
	 * @param rows    int tamaño en filas de la matriz
	 * @param columns int tamaño en columnas de la matriz
	 * @return El contenido de la matriz creada
	 */
	public String createEmptyMatrix(int type, int rows, int columns) {
		String out = "";
		switch (type) {
			case 1: // Numeric Matrix
				int[][] newIntegerMatrix = new int[rows][columns];
				numericMatrixes.add(newIntegerMatrix);
				out = getNumericMatrixInfo(numericMatrixes.size() - 1);

				break;
			case 2: // String Matrix
				String[][] newStringMatrix = new String[rows][columns];
				stringMatrixes.add(newStringMatrix);
				out = printStringMatrix(stringMatrixes.size() - 1);
				break;
		}

		return out;

	}

	/**
	 * Descripcion: Permite crear una matriz con dimensiones rows, columns
	 * pre: La lista numericMatrixes esta inicializada
	 * pos: Se agrega la matriz a la lista de numericMatrixes
	 * 
	 * @param rows    int las filas de la matriz
	 * @param columns int las columnas de la matriz
	 * @return int la posicion donde se almacena la matriz en la lista
	 */
	public int addNumericMatrix(int rows, int columns) {

		numericMatrixes.add(new int[rows][columns]); //Ojo que se inicializa vacia

		return numericMatrixes.size() - 1;
	}

	/**
	 * Descripcion: Permite modificar la posicion fila,columna de una matriz con el
	 * valor proporcionado
	 * pre: La lista numericMatrixes esta inicializada
	 * pos: Se modifica la matriz en la lista de numericMatrixes
	 * 
	 * @param positionInList int posicion de la matriz en la lista
	 * @param row      int fila donde se encuentra la celda a modificar
	 * @param column   int columna donde se encuentra la celda a modificar
	 * @param value    int valor que se va actualizar
	 */
	public void modifyCellInNumericMatrix(int positionInList, int row, int column, int value) {

		numericMatrixes.get(positionInList)[row][column] = value; //Modifica el valor de una celda dada por el usuario

	}

	// String Matrix (Pending)
	public void addStringMatrix(int rows, int columns) {

	}

	// String Matrix (pending)
	public void modifyCellInStringMatrix(int positionInList, int row, int column, String value) {


	}

	// String Matrix (pending)
	public String getStringMatrixInfo(int position) {
		String print = "Pending";

		return print;
	}
}
