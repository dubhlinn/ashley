package cn.monolog.dubhlinn.ashley.se.abstracted;

/**
 * 抽象类例子
 * @author dubhlinn
 * @date 2019-11-29
 */
public abstract class Worker {
    /*
     * 成员变量——行业
     */
    private String profession;

    /**
     * 抽象类可以有构造方法
     * 但不能直接实例化
     */
    public Worker(String profession) {
        this.profession = profession;
    }

    /**
     * 抽象方法
     * 子类继承的时候必须重写
     */
    public abstract void work();

    /**
     * 抽象类可以有带实现的方法
     */
    public void getSalary() {
        System.out.println("发工资了,开心");
    }

    /**
     * getters & setters
     * @return
     */
    public String getProfession() {
        return profession;
    }
    public void setProfession(String profession) {
        this.profession = profession;
    }
}
