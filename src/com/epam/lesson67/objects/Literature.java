package com.epam.lesson67.objects;

/**
 * Created by Natallia_Lahun on 03/20/2017.
 */
public class Literature {

    private String title;
    private Integer publicationYear;

    public Literature(){}

    public Literature(String title, Integer publicationYear) {
        this.title = title;
        this.publicationYear = publicationYear;
    }

    public void setTitle(String name){
        this.title = name;
    }
    public String getTitle(){
        return title;
    }

    public void setPublicationYear(Integer year){
        publicationYear = year;
    }

    public Integer getPublicationYear(){
        return publicationYear;
    }


    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((title == null) ? 0 : title.hashCode());
        result = prime * result + publicationYear;
        return result;
    }

    @Override
    public boolean equals(Object obj) {
        if (obj == null) {
            return false;
        }

        if (this == obj) {
            return true;
        }

        if (this.getClass() != obj.getClass()) {
            return false;
        }

        Literature literature = (Literature) obj;

        if (title == null) {
            if (literature.getTitle() != null) {
                return false;
            }
        } else if (!title.equals(literature.getTitle())) {
            return false;
        }
        return publicationYear.equals(literature.getPublicationYear());
    }

    @Override
    public String toString(){
        return "title: " + getTitle() + " , Publication Year: "+ getPublicationYear();
    }


}
