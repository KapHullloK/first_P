public abstract class Transport implements Serviceable {
    protected String modelName;
    protected int wheelsCount;

    public void updateTyre() {
        System.out.println("Меняем покрышку");
    }


    public String getModelName() {
        return modelName;
    }


    public void setModelName(String modelName) {
        this.modelName = modelName;
    }


    public int getWheelsCount() {
        return wheelsCount;
    }


    public void setWheelsCount(int wheelsCount) {
        this.wheelsCount = wheelsCount;
    }
}
