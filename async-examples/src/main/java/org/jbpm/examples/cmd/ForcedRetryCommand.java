package org.jbpm.examples.cmd;

import org.kie.internal.executor.api.Command;
import org.kie.internal.executor.api.CommandContext;
import org.kie.internal.executor.api.ExecutionResults;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class ForcedRetryCommand implements Command {

	private Logger logger = LoggerFactory.getLogger(ForcedRetryCommand.class);
	
	public static int executionCount = 0;
	
	public ExecutionResults execute(CommandContext ctx) throws Exception {
		
		executionCount++;
		logger.info("execution " + executionCount);
		
		if ( executionCount == 1 ){
			throw new RuntimeException( "deliberately causing an error" );
		}
		
		return new ExecutionResults();
	}

}
