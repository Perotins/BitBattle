package me.perotin.bitbattle.traits;

/**
 * A trait that can be leveled up.
 */
public interface LevelableTrait extends Trait {

    /**
     * Returns the current level of this trait.
     *
     * @return the level of this trait
     */
    int getLevel();

    /**
     * Returns the upper bound level that this trait can reach.
     *
     * @return the highest level this
     */
    int getMaxLevel();

    /**
     * Return <tt>true</tt> if this trait has not yet
     * reached its highest level.
     *
     * @return <tt>true</tt> if this trait can be leveled up
     */
    boolean hasNextLevel();

    /**
     * Raises the level of this trait by {@code 1}. If this
     * trait has already reached its highest level, as
     * determined by the {@link #hasNextLevel()} method, an
     * {@link IllegalStateException} will be thrown.
     *
     * @throws IllegalStateException if this trait is already
     *                               at its highest level
     */
    void levelUp() throws IllegalStateException;
}
