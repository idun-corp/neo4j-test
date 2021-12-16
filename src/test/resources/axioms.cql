
//----------- PetOwners----------------
CREATE(po1:Boy:PetOwner {name: 'Boy1',
                         uuid: '00000001-0000-0000-0000-000000000000'})
CREATE(po2:Boy:PetOwner {name: 'Boy2',
                         uuid: '00000002-0000-0000-0000-000000000000'})
CREATE(po3:Girl:PetOwner {name: 'Girl1',
                         uuid: '00000003-0000-0000-0000-000000000000'})
CREATE(po4:Girl:PetOwner {name: 'Girl2',
                         uuid: '00000004-0000-0000-0000-000000000000'})

//-------------- Animals -------------
CREATE(a1:Dog:Animal {name: 'Dog1',
                      uuid: '00000000-0001-0000-0000-000000000000'})
CREATE(a2:Dog:Animal {name: 'Dog2',
                      uuid: '00000000-0002-0000-0000-000000000000'})
CREATE(a3:Cat:Animal {name: 'Cat1',
                       uuid: '00000000-0003-0000-0000-000000000000'})
CREATE(a4:Cat:Animal {name: 'Cat2',
                       uuid: '00000000-0004-0000-0000-000000000000'})


CREATE (po1)-[:hasPet]->(a1)
CREATE (po1)-[:hasPet]->(a3)

CREATE (po3)-[:hasPet]->(a2)
CREATE (po3)-[:hasPet]->(a4)
