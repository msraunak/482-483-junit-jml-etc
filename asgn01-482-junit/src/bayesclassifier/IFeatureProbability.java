package bayesclassifier;

public interface IFeatureProbability<T, K> {

    public float featureProbability(T feature, K category);

}
