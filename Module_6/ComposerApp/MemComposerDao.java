package Module_6.ComposerApp;

import java.util.ArrayList;
import java.util.List;

public class MemComposerDao implements ComposerDao {
    private List<Composer> composers;

    public MemComposerDao() {
        // Initialize with default list of five composers
        this.composers = new ArrayList<>();
        composers.add(new Composer(1, "Beethoven", "Classical"));
        composers.add(new Composer(2, "Mozart", "Classical"));
        composers.add(new Composer(3, "Bach", "Baroque"));
        composers.add(new Composer(4, "Chopin", "Romantic"));
        composers.add(new Composer(5, "Vivaldi", "Baroque"));
    }

    @Override
    public List<Composer> findAll() {
        return composers;
    }

    @Override
    public Composer findBy(Integer id) {
        for (Composer composer : composers) {
            if (composer.getId() == id) {
                return composer;
            }
        }
        return null; // Return null if not found
    }

    @Override
    public void insert(Composer composer) {
        composers.add(composer);
    }
}
