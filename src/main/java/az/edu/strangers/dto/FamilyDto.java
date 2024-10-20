package az.edu.strangers.dto;

import az.edu.strangers.entity.Human;
import az.edu.strangers.entity.Pet;

import java.io.Serial;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.Set;


public class FamilyDto implements Serializable {

    private static final long serialVersionUID = 1L;
    private Human father;
    private Human mother;
    private Set<Pet> pets;
    private List<Human> children = new ArrayList<>();

    public FamilyDto(Human father, Human mother) {
        this.father = father;
        this.mother = mother;
    }

    @Override
    public String toString() {
        return "FamilyDto{father=%s, mother=%s, pet=%s, children=%s}"
                .formatted(father, mother, pets, children);
    }

    public Human getFather() {
        return father;
    }

    public void setFather(Human father) {
        this.father = father;
    }

    public Human getMother() {
        return mother;
    }

    public void setMother(Human mother) {
        this.mother = mother;
    }

    public Set<Pet> getPets() {
        return pets;
    }

    public void setPets(Set<Pet> pet) {
        this.pets = pet;
    }

    public List<Human> getChildren() {
        return children;
    }

    public void setChildren(List<Human> children) {
        this.children = children;
    }

    @Override
    public int hashCode() {
        return Objects.hash(father, mother, children, pets);
    }

    @Override
    public boolean equals(Object object) {
        if (this == object) return true;
        if (object == null || getClass() != object.getClass()) return false;
        FamilyDto familyDto = (FamilyDto) object;
        return Objects.equals(father, familyDto.father) &&
                Objects.equals(mother, familyDto.mother) &&
                Objects.equals(children, familyDto.children) &&
                Objects.equals(pets, familyDto.pets);
    }

}
