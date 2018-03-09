# Non-MapReduce-Mapreduce
## A Non-MapReduce life program made to carry out map reduce like behaviour 
-----

### Written in Java to carry out the following tasks: 

+ Read in a csv file 
+ seperate the data at the dilimater 
+ Pass data into a Hashmap 
+ Shuffle/sort the data by key value pairs 
+ pass the data to a Reducer function 

-------

#### Basic behaviour: 

  1. Data is read in via a BufferedReader (system.in)
  2. Data is passed to an `ArrayList<>`
  3. Data is pased to a `Mapper Function` 
  4. Data is seperated into `Key Value Pairs` 
  5. Data is then shuffled & sorted `Shuffle`
  6. Data is then passed to the `Reducer` 
  
  As such the outputs are reliant on a spefiic job being selected: 

--------------------


##### Job1 will reduce data to the following: 

> Determine the number of flights from each airport; include a list of any airports not used. 

##### Job2 will reduce data to the following: 

> Create a list of flights based on the Flight id, this output should include the passenger Id, relevant IATA/FAA codes, the departure time, the arrival time (times to be converted to HH:MM:SS format),
and the flight times. 

##### Job3 will reduce data to the following: 

> Calculate the number of passengers on each flight. 


------
Written for BSc Computer Science Module __CS3AC16__
