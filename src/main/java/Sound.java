import java.util.*;
public class Sound
{
  /** the array of values in this sound; guaranteed not to be null */
  int[] samples;



  /** Changes those values in this sound that have an amplitude greater than limit.
   *  Values greater than limit are changed to limit.
   *  Values less than -limit are changed to -limit.
   *  @param limit the amplitude limit
   *         Precondition: limit >= 0
   *  @return the number of values in this sound that this method changed
   */
  public int limitAmplitude(int limit)
  {  
 int numChanged = 0;
 for (int i = 0; i < this.samples.length; i++) {
 if (this.samples[i] < -limit) {
 this.samples[i] = -limit;
 numChanged++;
 }
 if (this.samples[i] > limit) {
 this.samples[i] = limit;
 numChanged++;
 }
 }
 return numChanged;
} 



  /** Removes all silence from the beginning of this sound.
   *  Silence is represented by a value of 0.
   *  Precondition: samples contains at least one nonzero value
   *  Postcondition: the length of samples reflects the removal of starting silence
   */
  public void trimSilenceFromBeginning()
  {
    /* to be implemented in part (b) */
int i = 0;
 while (this.samples[i] == 0) {
 i++;
 }
 int[] newSamples = new int[this.samples.length - i];
 for (int j = 0; j < newSamples.length; j++) {
 newSamples[j] = this.samples[j+i];
 }
 this.samples = newSamples;
} 


