package org.launchcode.techjobs_oo.Tests;

import org.junit.Before;
import org.junit.Test;
import org.launchcode.techjobs_oo.*;

import static org.junit.Assert.*;

public class JobTest {
    Job testJob;
    Job testJob2;
    @Before
    public void createJobObjects() {
        testJob = new Job("Product tester", new Employer("ACME"), new Location("Desert"), new PositionType(
                "Quality control"), new CoreCompetency("Persistence"));
        testJob2 = new Job("Product tester", new Employer("ACME"), new Location("Desert"), new PositionType(
                "Quality control"), new CoreCompetency("Persistence"));
    }





    @Test
    public void testJobConstructorSetsAllFields() {
        assertEquals(1, testJob.getId());
        assertEquals("Product tester", testJob.getName());
        assertEquals("ACME", testJob.getEmployer().getValue());
        assertEquals("Desert", testJob.getLocation().getValue());
        assertEquals("Quality control", testJob.getPositionType().getValue());
        assertEquals("Persistence", testJob.getCoreCompetency().getValue());

        //Cannot take instances of primitive type assertTrue(testJob.getId());
        assertTrue(testJob.getName() instanceof String);
        assertTrue(testJob.getEmployer() instanceof Employer);
        assertTrue(testJob.getLocation() instanceof Location);
        assertTrue(testJob.getPositionType() instanceof PositionType);
        assertTrue(testJob.getCoreCompetency() instanceof CoreCompetency);

    }

    @Test
    public void testSettingJobId() {
        Job job1 = new Job();
        Job job2 = new Job();
        assertEquals((job1.getId() + 1), job2.getId());
    }

    @Test
    public void testJobsForEquality() {
        assertFalse(testJob.equals(testJob2));
    }
}
