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
	 * Descripcion: Permite crear una matriz vacia segun el tipo: 1, numerica (int) 2, de caracteres (String)
	 * @param type int variable utilizada para crear la matriz vacía según el tipo
	 * @param rows int tamaño en filas de la matriz
	 * @param columns int tamaño en columnas de la matriz
	 * @return
	 */
	public String createEmptyMatrix(int type, int rows, int columns) {
		String out = "";
		switch (type) {
			case 1: // Numeric Matrix
				int[][] newIntegerMatrix = new int[rows][columns];
				numericMatrixes.add(newIntegerMatrix);
				out = printNumericMatrix(newIntegerMatrix);

				break;
			case 2: // String Matrix
				String[][] newStringMatrix = new String[rows][columns];
				stringMatrixes.add(newStringMatrix);
				out = printStringMatrix(newStringMatrix);
				break;
		}

		return out;

	}

	/**
	 * Descripcion: Permite mostrar TODAS las matrices registradas en el sistema
	 * @return El listado de matrices registradas en formato String
	 */
	public String showAllMatrixes() {
		String out = "";
		out += "\nNumeric matrixes \n";

		if (!numericMatrixes.isEmpty()) {

			for (int i = 0; i < numericMatrixes.size(); i++) {
				out += printNumericMatrix(numericMatrixes.get(i))+"\n";
			}
		} else {

			out += "There are no numeric matrixes registered yet \n";

		}

		out += "\nString matrixes \n";

		if (!stringMatrixes.isEmpty()) {

			for (int i = 0; i < stringMatrixes.size(); i++) {
				out += printStringMatrix(stringMatrixes.get(i));
			}
		} else {
			out += "There are no String matrixes registered yet \n";
		}

		return out;
	}

	/**
	 * Descripcion: Permite añadir una matriz numerica a la lista de matrices numericas
	 * @param numMatrix La matriz numerica (int) a añadir
	 */
	public void addNumericMatrix(int[][] numMatrix) {
		numericMatrixes.add(numMatrix);
	}

	/**
	 * Descripcion: Permite generar una cadena String con el contenido de la matriz pasada por parametro
	 * @param numMatrix La matriz numerica a imprimir
	 * @return El contenido de la matriz en formato String
	 */
	private String printNumericMatrix(int[][] numMatrix) {
		String print = "";
		for (int i = 0; i < numMatrix.length; i++) { // filas numbers.length
			for (int j = 0; j < numMatrix[0].length; j++) { // columnas numbers[0].length
				print += numMatrix[i][j] + " ";
			}
			print += "\n";
		}

		return print;
	}

	// String Matrix (Pending)
	public void addStringMatrix(String[][] stringMatrix) {

	}

	// String Matrix (pending)
	private String printStringMatrix(String[][] stringMatrix) {
		String print = "Pending";

		return print;
	}
}
