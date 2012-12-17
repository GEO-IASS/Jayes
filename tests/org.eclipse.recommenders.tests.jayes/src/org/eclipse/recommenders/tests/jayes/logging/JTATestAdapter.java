/*******************************************************************************
 * Copyright (c) 2012 Michael Kutschke.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 * 
 * Contributors:
 *     Michael Kutschke - initial API and implementation
 ******************************************************************************/
package org.eclipse.recommenders.tests.jayes.logging;

import java.util.List;
import java.util.Map;

import org.eclipse.recommenders.jayes.factor.AbstractFactor;
import org.eclipse.recommenders.jayes.inference.junctionTree.JunctionTreeAlgorithm;
import org.eclipse.recommenders.jayes.util.Pair;
import org.eclipse.recommenders.jayes.util.Graph.Edge;
import org.eclipse.recommenders.jayes.util.arraywrapper.IArrayWrapper;

public class JTATestAdapter extends JunctionTreeAlgorithm {
	
	public AbstractFactor[] getNodePotentials(){
		return nodePotentials;
	}
	
	public Map<Edge,AbstractFactor> getSepsets(){
		return sepSets;
	}
	
	public Map<Edge,int[]> getPreparedMultiplications(){
		return preparedMultiplications;
	}
	
	public int[][] getPreparedQueries(){
		return preparedQueries;
	}
	
	public List<Pair<AbstractFactor, IArrayWrapper>> getInitializations(){
		return initializations;
	}

}