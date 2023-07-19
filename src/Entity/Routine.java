
package Entity;

public class Routine {
    private int id;
    private String name;
    private double duration;
    private int levelDifficulty;
    private String description;

    public Routine() {
    }

    public Routine(int id, String name, double duration, int levelDifficulty, String description) {
        this.id = id;
        this.name = name;
        this.duration = duration;
        this.levelDifficulty = levelDifficulty;
        this.description = description;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getDuration() {
        return duration;
    }

    public void setDuration(double duration) {
        this.duration = duration;
    }

    public int getLevelDifficulty() {
        return levelDifficulty;
    }

    public void setLevelDifficulty(int levelDifficulty) {
        this.levelDifficulty = levelDifficulty;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    @Override
    public String toString() {
        return "Routine{" + "id=" + id + ", name=" + name + ", duration=" + duration + ", levelDifficulty=" + levelDifficulty + ", description=" + description + '}';
    }
}
