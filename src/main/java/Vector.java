public class Vector {
    private double x = 0, y = 0, z = 0;

    public Vector(double x, double y, double z) {
        this.x = x;
        this.y = y;
        this.z = z;
    }

    public double length(){
        return Math.sqrt(this.x * this.x + this.y * this.y + this.z * this.z);
    }

    public double scalarComp(Vector vector_2){
        return this.x * vector_2.x + this.y * vector_2.y + this.z * vector_2.z;
    }

    public Vector vectorComp(Vector vector_2){
        return new Vector(this.y * vector_2.z - vector_2.y * this.z,
                this.z * vector_2.x - vector_2.z * this.x,
                this.x * vector_2.y - vector_2.x * this.y);
    }

    public double cos(Vector vector_2){
        return scalarComp(vector_2) / (this.length() * vector_2.length());
    }

    public Vector sum(Vector vector_2){
        return new Vector(this.x + vector_2.x, this.y + vector_2.y, this.z + vector_2.z);
    }

    public Vector diff(Vector vector_2){
        return new Vector(this.x - vector_2.x, this.y - vector_2.y, this.z - vector_2.z);
    }
}
