
//----------- PetOwners----------------
CREATE(po1:Boy:PetOwner:Base {name: 'Boy1',
                         uuid: '00000001-0000-0000-0000-000000000000'})
CREATE(po2:Boy:PetOwner:Base {name: 'Boy2',
                         uuid: '00000002-0000-0000-0000-000000000000'})
CREATE(po3:Girl:PetOwner:Base {name: 'Girl1',
                         uuid: '00000003-0000-0000-0000-000000000000'})
CREATE(po4:Girl:PetOwner:Base {name: 'Girl2',
                         uuid: '00000004-0000-0000-0000-000000000000'})

//-------------- Animals -------------
CREATE(a1:Dog:Animal:Base {name: 'Dog1',
                      uuid: '00000000-0001-0000-0000-000000000000'})
CREATE(a2:Dog:Animal:Base {name: 'Dog2',
                      uuid: '00000000-0002-0000-0000-000000000000'})
CREATE(a3:Cat:Animal:Base {name: 'Cat1',
                       uuid: '00000000-0003-0000-0000-000000000000'})
CREATE(a4:Cat:Animal:Base {name: 'Cat2',
                       uuid: '00000000-0004-0000-0000-000000000000'})


CREATE (po1)-[:hasPet]->(a1)
CREATE (po1)-[:hasPet]->(a3)

CREATE (po3)-[:hasPet]->(a2)
CREATE (po3)-[:hasPet]->(a4)
