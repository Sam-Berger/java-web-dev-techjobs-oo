package org.launchcode.techjobs_oo.Tests;

import org.junit.Before;
import org.junit.Test;
import org.launchcode.techjobs_oo.*;

import static org.junit.Assert.*;

public class JobTest {
    Job testJob;
    Job testJob2;
    Job job1;
    Job job2;
    @Before
    public void createJobObjects() {
        testJob = new Job("Product tester", new Employer("ACME"), new Location("Desert"), new PositionType(
                "Quality control"), new CoreCompetency("Persistence"));
        testJob2 = new Job("Product tester", new Employer("ACME"), new Location("Desert"), new PositionType(
                "Quality control"), new CoreCompetency("Persistence"));
        job1 = new Job();
        job2 = new Job();
    }

    @Test
    public void testJobConstructorSetsAllFields() {
        //assertEquals(1, testJob.getId());
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
        assertEquals((job1.getId() + 1), job2.getId());
    }

    @Test
    public void testJobsForEquality() {
        assertFalse(testJob.equals(testJob2));
    }

    @Test
    public void blankLineAboveAndBelowJobsToString() {
        assertTrue(testJob.toString().startsWith("\n"));
        assertTrue(testJob.toString().endsWith("\n"));
    }

    @Test
    public void toStringDisplay() {
        assertEquals("\n" +
                "ID: " + testJob.getId() + "\n" +
                "Name: Product tester\n" +
                "Employer: ACME\n" +
                "Location: Desert\n" +
                "Position Type: Quality control\n" +
                "Core Competency: Persistence\n", testJob.toString());
    }

    @Test
    public void toStringEmptyField() {
        assertEquals("\n" +
                "ID: " + job1.getId() + "\n" +
                "Name: Data not available\n" +
                "Employer: Data not available\n" +
                "Location: Data not available\n" +
                "Position Type: Data not available\n" +
                "Core Competency: Data not available\n", job1.toString());
    }
}
