package Assignment4;
public class Matrix {
    private int rows;
    private int cols;
    private int[][] elements;

    
    public Matrix(int rows, int cols) {
        this.rows = rows;
        this.cols = cols;
        this.elements = new int[rows][cols];
    }

    
    public int getNumberOfRows() {
        return rows;
    }

    
    public int getNumberOfColumns() {
        return cols;
    }

    
    public void setElement(int i, int j, int value) {
        if (i >= 0 && i < rows && j >= 0 && j < cols) {
            elements[i][j] = value;
        } else {
            throw new IndexOutOfBoundsException("Index out of bounds");
        }
    }

    
    public Matrix add(Matrix other) {
        if (this.rows != other.rows || this.cols != other.cols) {
            System.out.println("Matrices cannot be added");
            return null;
        }

        Matrix result = new Matrix(this.rows, this.cols);
        for (int i = 0; i < this.rows; i++) {
            for (int j = 0; j < this.cols; j++) {
                result.elements[i][j] = this.elements[i][j] + other.elements[i][j];
            }
        }
        return result;
    }

    
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        for (int[] row : elements) {
            for (int value : row) {
                sb.append(value).append(" ");
            }
            sb.append("\n");
        }
        return sb.toString();
    }

    
    public static void main(String[] args) {
        Matrix matrix1 = new Matrix(2, 2);
        matrix1.setElement(0, 0, 1);
        matrix1.setElement(0, 1, 2);
        matrix1.setElement(1, 0, 3);
        matrix1.setElement(1, 1, 4);

        Matrix matrix2 = new Matrix(2, 2);
        matrix2.setElement(0, 0, 5);
        matrix2.setElement(0, 1, 6);
        matrix2.setElement(1, 0, 7);
        matrix2.setElement(1, 1, 8);

        System.out.println("Matrix 1:");
        System.out.println(matrix1);

        System.out.println("Matrix 2:");
        System.out.println(matrix2);

        Matrix sumMatrix = matrix1.add(matrix2);
        if (sumMatrix != null) {
            System.out.println("Sum of Matrix 1 and Matrix 2:");
            System.out.println(sumMatrix);
        }
    }
}


