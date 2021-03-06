package meetup_08_tree_traversal.applications;

import junitparams.Parameters;
import meetup_06_stack_queue_dynamic_array.adt.DynamicList;
import meetup_08_tree_traversal.adt.TreeNode;
import org.junit.Test;

import static org.hamcrest.Matchers.is;
import static org.junit.Assert.assertThat;

public class InOrderTraversalIterativelyTest
        extends InOrderTraversalAbstractTest {

    @Override
    protected InOrderTraversalIteratively<Integer> createTraversal() {
        return new InOrderTraversalIteratively<>();
    }

    @Test
    @Parameters(method = "data")
    public void itShouldTraverseInOrderFirstTry(TreeNode root,
                                                DynamicList<Integer> inorder) {
        InOrderTraversalIteratively<Integer> traversal = createTraversal();

        assertThat(traversal.inOrderTraversalFirstTry(root), is(inorder));
    }

}
