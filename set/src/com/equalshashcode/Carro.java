package com.equalshashcode;

public class Carro implements Comparable<Carro> {

    String marca;

    

    public Carro(String marca) {
        this.marca = marca;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((marca == null) ? 0 : marca.hashCode());
        return result;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;
        if (getClass() != obj.getClass())
            return false;
        Carro other = (Carro) obj;
        if (marca == null) {
            if (other.marca != null)
                return false;
        } else if (!marca.equals(other.marca))
            return false;
        return true;
    }

    @Override
    public String toString() {
        return "Carro [marca=" + marca + "]";
    }

    //compareTo - Comparar por quantidade de caracteres:
    /* @Override
    public int compareTo(Carro outro) {
        if(this.marca.length() < outro.marca.length()){
            return -1;
        }else if(this.marca.length() > outro.marca.length()){
            return 1;
        }else return 0;    
    }  */

    //compareTo - Comparar por odem alfabética;
    @Override
    public int compareTo(Carro obj) {
        return this.getMarca().compareTo(obj.getMarca());
    }

}
