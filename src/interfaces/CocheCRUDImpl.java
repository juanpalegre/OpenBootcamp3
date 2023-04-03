package interfaces;

public class CocheCRUDImpl implements CocheCRUD{
    @Override
    public void save() {
        System.out.println("This is the save() implementation");
    }

    @Override
    public void findAll() {
        System.out.println("This is the findAll() implementation");
    }

    @Override
    public void delete() {
        System.out.println("This is the delete() implementation");
    }
}
