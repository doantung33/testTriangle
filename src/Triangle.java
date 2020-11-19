public class Triangle {
    public static String triangleType(int edgeA, int edgeB, int edgeC) {
        if (edgeA == edgeB && edgeA == edgeC)
            return "Tam giác đều";
        if (edgeA == edgeB || edgeA == edgeC || edgeB == edgeC)
            return "Tam giác cân";
        if (edgeA+edgeB>edgeC
                && edgeA+edgeC>edgeB
                && edgeB+edgeC>edgeA)
            return "Tam giác thường";
        if (edgeA+edgeB<edgeC
                && edgeA+edgeC<edgeB
                && edgeB+edgeC<edgeA)
            return null;
            return "Không phải tam giác";


    }
}
