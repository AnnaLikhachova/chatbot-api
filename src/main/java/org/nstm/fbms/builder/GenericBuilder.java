package org.nstm.fbms.builder;

/**
 * @author vgorin
 *         file created on 12/7/16 5:48 PM
 */


abstract class GenericBuilder<T> {
	private boolean built = false;

	abstract T buildGeneric();

	public T build() {
		if(built) {
			throw new IllegalStateException("already built!");
		}
		built = true;
		return buildGeneric();
	}
}
